# Compiles everything.
all: build

# Builds the app in the prod environment.
build:
	# Use `gradlew.bat build` if on Windows.
	BUILD_ENV=production ./gradlew build

# Builds and runs the webpack dev server.
dev:
	# Use `gradlew.bat -t run` if on Windows.
	BUILD_ENV=development ./gradlew -t run

# Stops the dev server.
stop:
	# Use `gradlew.bat stop` if on Windows.
	./gradlew stop

# Serves the web app using express server.
serve:
	NODE_ENV=production node web/src/server/server.js

# Removes all object and executable files.
clean:
	# Use `gradlew.bat clean` if on Windows.
	./gradlew clean

# Removes and recompiles everything in prod mode.
fresh: clean build

# Rebuilds in dev mode and starts the dev server.
redev: clean dev

# Specifies which rule targets don't actually refer to filenames, but
# are just commands instead.
.PHONY: all build dev stop serve clean fresh redev