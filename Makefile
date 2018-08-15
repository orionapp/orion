# Compiles everything.
all: build

# Builds the app in the prod environment.
build:
	# Use `gradlew.bat build` if on Windows.
	./gradlew -Penv=production build

# Builds and runs the webpack dev server.
dev: stop clean
	# Use `gradlew.bat -t run` if on Windows.
	./gradlew -Penv=development -t run

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
stage: clean build

# Specifies which rule targets don't actually refer to filenames, but
# are just commands instead.
.PHONY: all build dev stop serve clean stage