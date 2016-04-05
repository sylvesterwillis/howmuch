# howmuch

generated using Luminus version "2.9.10.33"

FIXME

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen


You will also need to install and setup the Postgres server using the following:

    sudo apt-get update
    sudo apt-get install postgresql postgresql-contrib

Switch over to the postgres user using:
    sudo -i -u postgres
    createuser --interactive


## Running

To start a web server for the application, run:

    lein run

## License

Copyright © 2016
