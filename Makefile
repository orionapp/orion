# Compiles everything.
all: prod

# Builds the app in the dev environment.
dev:
	# Use `gradlew.bat build` if on Windows.
	BUILD_ENV=development ./gradlew build

# Builds the app in the prod environment.
prod:
	# Use `gradlew.bat build` if on Windows.
	BUILD_ENV=production ./gradlew build

# Runs the web app in a dev server.
run:
	# Use `gradlew.bat web:run` if on Windows.
	BUILD_ENV=development ./gradlew web:run

# Stops the dev server in the background.
stop:
	# Use `gradlew.bat web:stop` if on Windows.
	BUILD_ENV=development ./gradlew web:stop

# Removes all object and executable files.
clean:
	# Use `gradlew.bat clean` if on Windows.
	./gradlew clean

# Removes and recompiles everything in dev mode.
rebuild: clean dev

# Rebuilds in dev mode and starts the dev server.
rerun: clean run

# Rebuilds everything in the production environment.
stage: clean prod

# Specifies which rule targets don't actually refer to filenames, but
# are just commands instead.
.PHONY: all dev prod run stop clean rebuild rerun stage