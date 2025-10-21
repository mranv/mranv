<div align="center">
  <img src="https://raw.githubusercontent.com/mranv/mranv/main/anubhavgain.png" alt="Anubhav Gain Banner" />

  <h3>Hi there 👋 I'm Anubhav Gain</h3>
  <p><i>Cybersecurity Enthusiast | eBPF Developer | Cloud Security Professional</i></p>

  [![Website](https://img.shields.io/badge/Website-mranv.pages.dev-blue?style=flat-square&logo=google-chrome)](https://mranv.pages.dev)
  [![Twitter](https://img.shields.io/badge/Twitter-@AnubhavGain-1DA1F2?style=flat-square&logo=twitter&logoColor=white)](https://twitter.com/AnubhavGain)
  [![LinkedIn](https://img.shields.io/badge/LinkedIn-anubhavgain-0077B5?style=flat-square&logo=linkedin&logoColor=white)](https://linkedin.com/in/anubhavgain)
  [![Instagram](https://img.shields.io/badge/Instagram-anubhavgain-E4405F?style=flat-square&logo=instagram&logoColor=white)](https://instagram.com/anubhavgain)
  [![RSS Feed](https://img.shields.io/badge/RSS-Subscribe-FFA500?style=flat-square&logo=rss&logoColor=white)](https://mranv.pages.dev/rss.xml)
</div>

---

## 📊 GitHub Analytics

<div align="center">
  <img src="https://raw.githubusercontent.com/mranv/mranv/main/github-metrics.svg" alt="GitHub Metrics" />
</div>

---

## 🚀 Current Projects

{{ range recentContributions 5 }}
- **[{{ .Repo.Name }}]({{ .Repo.URL }})** - {{ .Repo.Description }}
{{- end }}

---

## 🌱 Latest Repositories

{{ range recentRepos 5 }}
- **[{{ .Name }}]({{ .URL }})** {{ if .Description }}- {{ .Description }}{{ end }}
{{- end }}

---

## ⭐ Recently Starred

{{ range recentStars 5 }}
- **[{{ .Repo.Name }}]({{ .Repo.URL }})** - {{ .Repo.Description }}
{{- end }}

---

## 📝 Latest Blog Posts

{{ range rss "https://mranv.pages.dev/rss.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}

---

<div align="center">
  <h3>📫 Connect With Me</h3>

  [![Website](https://img.shields.io/badge/🌐_Website-mranv.pages.dev-blue?style=for-the-badge)](https://mranv.pages.dev)
  [![Twitter](https://img.shields.io/badge/Twitter-@AnubhavGain-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/AnubhavGain)
  [![LinkedIn](https://img.shields.io/badge/LinkedIn-anubhavgain-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/anubhavgain)
  [![Instagram](https://img.shields.io/badge/Instagram-anubhavgain-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/anubhavgain)

  <p><i>💡 Passionate about eBPF, Cybersecurity, and Cloud Technologies</i></p>
  <p><sub>⚡ Profile updates weekly via GitHub Actions</sub></p>
</div>
