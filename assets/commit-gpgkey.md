
# GitHub commit verification using SSH keys

## Overview
Today we will discuss a very important security question that may not be as obvious at first glance.

We will take a look at verifying git commits by signing each commit with a SSH key and why it is important.

Implementing commit verification gives assurance about the authenticity of the author of commits made to your code.

GitHub always supported commit signing via GPG keys, but this was usually harder and a bit more tricky to implement.

Very recently GitHub started support for commit signing and verification using SSH keys, which really simplifies the process and gives you the same ability to sign commits and tags locally using a self-generated SSH public key, which will give others confidence about the origin of a change you have made. If a commit or tag has an SSH signature that is cryptographically verifiable, GitHub makes the commit or tag "Verified" or "Partially Verified".

Signing commits adds a layer of protection for your codebase. We will also look at how we can actively enforce signature verification to prevent unsigned commits from being pushed to your repositories.

## Security Liability - Example
Let's take a quick look at an example first. Recently a user called "Pwd9000-ML" has made a code change on my repository and committed those changes to my projects codebase. Have a look at the following git commit:

To the untrained eye, this doesn't look like anything out of the norm.

As you might have guessed, my own user account is called "Pwd9000-ML", but this change didn't actually come from me. So how is this possible?

Anyone can spoof a git commit author name with just a few git commands and pretend to be someone else, for example:
```bash
git config user.name "Pwd9000-ML"
git config user.email "fake.email@spoofed.com"
git commit -m "Added awesome new feature"
```

This poses a big security question. How can you verify who is pushing code to your repository?

## Solution
Thankfully GitHub has made it so easy for us to secure our codebase even further by making the following easy to implement features available to us.

1. Enable vigilant mode
First let's turn on something called vigilant mode, where we enable displaying verification statuses for all git commits.

To enable vigilant mode:

- Navigate to your GitHub account 'Settings'.
- Navigate to 'SSH and GPG keys' and tick 'Flag unsigned commits as unverified'.

2. Create a SSH signing key
Next we will enable SSH commit verification so that any future commits will be signed and shown as "Verified".

To enable SSH commit verification you can either use an existing SSH key or generate a new SSH key:

- Open a command terminal and run:
```bash
$ ssh-keygen -t ed25519 -C "iamanubhavgain@gmail.com"
```

We are only interested in the '.pub' file as that contains the Public Key. Open the '.pub' file and copy the entire contents of the file to your clipboard.

Next navigate to your GitHub account 'Settings'.

- Navigate to 'SSH and GPG keys' and select 'New SSH key'.
- Give the SSH key a Title, select the Key type as 'Signing Key' and copy the entire contents of the '.pub' file into the Key field.

Next we will run a few git commands so that will configure git to sign all commits using the SSH key. Make sure that the minimum version of git is at least v2.34 or above.

To configure git commit signing on an individual repository, open a command prompt and navigate to the path of your cloned GitHub repository and run the following commands:

```bash
### Navigate to cloned repo root for individual repos ###
### Configure name ###
git config user.name "mranv"

### Configure email (same as what was specified in SSH key gen) ###
git config user.email "iamanubhavgain@gmail.com"

### Specify the location of the SSH public key, default path is: /c/Users/you/.ssh/id_algorithm ###
git config user.signingkey "C:\Users\Monkey/.ssh/id_ed25519.pub"

### Enable/Enforce commit signing ###
git config commit.gpgsign true

### Configure commit signing format ###
git config gpg.format ssh
```

To configure git commit signing on all repositories, open a command prompt run the following 'global' commands:

```bash
### Global signing on all repos ###
### Configure name ###
git config --global user.name "mranv"

### Configure email (same as what was specified in SSH key gen) ###
git config --global user.email "iamanubhavgain@gmail.com"

### Specify the location of the SSH public key, default path is: /c/Users/you/.ssh/id_algorithm ###
git config --global user.signingkey "C:\Users\Monkey/.ssh/id_ed25519.pub"

### Enable/Enforce commit signing ###
git config --global commit.gpgsign true

### Configure commit signing format ###
git config --global gpg.format ssh
```

That's it, now when you make any changes to your code and commit those changes they will be signed using the SSH public key and be displayed as 'Verfied' on your git commit history on your GitHub repo.

3. Enable a branch protection rule
The last thing I wanted to cover was how you can actively enforce signature verification to prevent unsigned commits from being pushed to your repositories.

We can easily achieve this by configuring a Branch protection rule

- Navigate to the repository you want to protect and select 'Settings' -> 'Branches' -> 'Add branch protection rule'.
- Configure a 'Branch name pattern' for the branch the policy should be applied to and select 'Require signed commits'.
- Select 'Create'. You should now have a branch policy applied that will enforce signed commits.

## Conclusion
As you can see it is very easy to configure commit signing and verification features in GitHub using SSH keys which will ensure the authenticity of authors and collaborators on your repositories and codebase.

I hope you have enjoyed this post and have learned something new. ❤️
