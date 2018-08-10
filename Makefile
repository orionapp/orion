# Compiles everything.
all: build

# Builds the app.
build:
	# Use `gradlew.bat build` if on Windows.
	./gradlew build

# Runs the app.
run:
	# Use `gradlew.bat run` if on Windows.
	./gradlew run

# Removes all object and executable files.
clean:
	# Use `gradlew.bat clean` if on Windows.
	./gradlew clean

# Removes and recompiles everything.
fresh: clean all

# Specifies which rule targets don't actually refer to filenames, but
# are just commands instead.
.PHONY: all build run clean fresh