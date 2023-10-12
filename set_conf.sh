#!/usr/bin/env bash

SOURCE_CONF_PATH="${APP_HOME}/modules/$MODULE_NAME/conf"
TARGET_CONF_PATH="${APP_HOME}/modules/${MODULE}/target/universal/stage/conf/"

echo "Set conf from ${SOURCE_CONF_PATH} to $TARGET_CONF_PATH"
cp -R ${SOURCE_CONF_PATH}/* ${TARGET_CONF_PATH}