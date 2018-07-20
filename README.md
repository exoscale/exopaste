# exopaste

*Exopaste* is a simple pastebin-like service written in the [Clojure programming language](https://clojure.org/), and whose purpose is mainly to demonstrate how [Exoscale](https://www.exoscale.com) writes high performance Clojure applications.

This project is the companion project for the series of *exopaste* articles published on our [Syslog blog](https://www.exoscale.com/syslog/).

## Running this project

Git tags are used to track the evolution of the project over several articles.
So to follow along on the article of your choice, checkout the corresponding
tag.

Once checked out, the project is managed with the [Leiningen](https://leiningen.org/) program: to start the pastebin server with the default configuration:

```bash
lein run
```

## Articles and their corresponding tags

- `2018-07-20`: https://www.exoscale.com/syslog/clojure-application-tutorial/ (tag: 0.1.0)
