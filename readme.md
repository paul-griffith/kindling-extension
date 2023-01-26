Proof of concept repo for creating a new Kindling compatible tool in an independent repo.

# Requirements

- Provide `GITHUB_USER` and `GITHUB_TOKEN` environment variables at build time to connect
  to [the Kindling/core repo](https://github.com/paul-griffith?tab=packages&repo_name=kindling)
- Build this project, adding any dependencies as needed.
- Run the main Kindling jar with your custom tool on the classpath, and your tool(s) should be automatically detected at
  runtime.
