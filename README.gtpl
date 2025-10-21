<p align="center">
  <img src="https://raw.githubusercontent.com/mranv/mranv/main/anubhavgain.png" height="200" />
</p>

### Socials

<p align="left">
  <a href="https://www.github.com/mranv" target="_blank" rel="noreferrer">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github-dark.svg" />
      <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" />
      <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/github.svg" width="32" height="32" />
    </picture>
  </a>
  <a href="http://www.instagram.com/anubhavgain" target="_blank" rel="noreferrer">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/instagram-dark.svg" />
      <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/instagram.svg" />
      <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/instagram.svg" width="32" height="32" />
    </picture>
  </a>
  <a href="https://www.linkedin.com/in/anubhavgain" target="_blank" rel="noreferrer">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin-dark.svg" />
      <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin.svg" />
      <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/linkedin.svg" width="32" height="32" />
    </picture>
  </a>
  <a href="https://mranv.pages.dev/rss.xml" target="_blank" rel="noreferrer">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/rss-dark.svg" />
      <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/rss.svg" />
      <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/rss.svg" width="32" height="32" />
    </picture>
  </a>
  <a href="https://www.x.com/AnubhavGain" target="_blank" rel="noreferrer">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/twitter-dark.svg" />
      <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/twitter.svg" />
      <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/socials/twitter.svg" width="32" height="32" />
    </picture>
  </a>
</p>

### GitHub Stats

<p align="left">
  <img src="https://raw.githubusercontent.com/mranv/mranv/main/github-metrics.svg" />
</p>

### 👷 Check out what I'm currently working on

{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 My latest projects

{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}){{ if .Description }} - {{ .Description }}{{ end }}
{{- end }}

### 🔨 My recent Pull Requests

{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### ⭐ Recent Stars

{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 📰 Recent Blog Posts

{{ range rss "https://mranv.pages.dev/rss.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}

### 📫 How to reach me

- Twitter: https://twitter.com/AnubhavGain
- Website: https://mranv.pages.dev
- LinkedIn: https://www.linkedin.com/in/anubhavgain
- Instagram: https://www.instagram.com/anubhavgain
