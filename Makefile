TARGET ?= orion
SRC_DIR ?= common/src/main
BIN_DIR ?= bin
BUILD_CMD ?= konanc $(SRC_DIR)/$(TARGET).kt
CLI_TARGET ?= cli/$(BIN_DIR)/$(TARGET)
WASM_TARGET ?= webassembly/$(BIN_DIR)/$(TARGET)
PORT ?= 5000

# Compiles everything.
all: cli

# Compiles the app into a CLI executable.
$(CLI_TARGET).kexe:
	@mkdir -p cli/$(BIN_DIR)
	$(BUILD_CMD) -o $(CLI_TARGET)

# Runs the CLI app.
cli: $(CLI_TARGET).kexe
	@./$(CLI_TARGET).kexe

# Compiles the app into WebAssembly.
$(WASM_TARGET).js:
	@mkdir -p webassembly/$(BIN_DIR)
	$(BUILD_CMD) -target wasm32 -o webassembly/$(BIN_DIR)/$(TARGET)

# Starts serving the web app.
start-wasm: $(WASM_TARGET).js
	docker run -p $(PORT):$(PORT) -d --name $(TARGET) -v $(shell pwd)/webassembly:/data surma/simplehttp2server
	open http://localhost:$(PORT)

# Stops serving the web app.
stop-wasm:
	docker stop $(TARGET)
	docker rm $(TARGET)

# Removes all object and executable files.
clean:
	rm -rf cli/$(BIN_DIR)
	rm -rf webassembly/$(BIN_DIR) webassembly/*.pem

# Removes and recompiles everything.
fresh: clean all

# Specifies which rule targets don't actually refer to filenames, but
# are just commands instead.
.PHONY: all cli start-wasm stop-wasm clean fresh
