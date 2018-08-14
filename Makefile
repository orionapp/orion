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

# Runs the app.
run:
	# Use `gradlew.bat run` if on Windows.
	./gradlew run

# Removes all object and executable files.
clean:
	# Use `gradlew.bat clean` if on Windows.
	./gradlew clean

# Removes and recompiles everything in dev mode.
rebuild: clean dev

# Rebuilds everything in the production environment.
stage: clean prod

# Specifies which rule targets don't actually refer to filenames, but
# are just commands instead.
.PHONY: all dev prod run clean rebuild stage