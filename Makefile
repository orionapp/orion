TARGET ?= orion
SRC_DIR ?= src
BIN_DIR ?= bin
BUILD_CMD ?= konanc $(SRC_DIR)/main.kt
TARGET_PATH ?= $(BIN_DIR)/$(TARGET).kexe

# Compiles everything.
all: $(TARGET_PATH)

# Compiles the target executable as the combination of many object files.
$(TARGET_PATH):
	@mkdir -p $(BIN_DIR)
	$(BUILD_CMD) -o $(TARGET_PATH)

# Runs the program executable.
run: $(TARGET_PATH)
	@./$(TARGET_PATH)

# Removes all object and executable files.
clean:
	rm -rf $(BIN_DIR)

# Removes and recompiles everything.
fresh: clean all

# Specifies which rule targets don't actually refer to filenames, but
# are just commands instead.
.PHONY: all run clean fresh
