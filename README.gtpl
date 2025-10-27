<div align="center">

<img src="https://raw.githubusercontent.com/mranv/mranv/main/anubhavgain.png" alt="Anubhav Gain" width="100%" />

<br>

<samp>
Cybersecurity Engineer specializing in eBPF, Endpoint Security & Cloud Infrastructure
<br>
Building security solutions with Rust, Go & Python
</samp>

<br>

[GitHub](https://github.com/mranv) • [LinkedIn](https://linkedin.com/in/anubhavgain) • [Website](https://mranv.pages.dev) • [Twitter](https://twitter.com/AnubhavGain) • [Blog](https://mranv.pages.dev/rss.xml)

<br>

<img src="https://raw.githubusercontent.com/mranv/mranv/main/github-metrics.svg" alt="GitHub Metrics" width="800" />

</div>

---

### Current Work

{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### Recent Projects

{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}){{ if .Description }} - {{ .Description }}{{ end }}
{{- end }}

### Recent Pull Requests

{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### Recently Starred

{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### Latest Blog Posts

{{ range rss "https://mranv.pages.dev/rss.xml" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}

---

<div align="center">
<samp>
Open to collaboration on security research, eBPF projects, and cloud-native development
</samp>
</div>
