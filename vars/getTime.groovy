#!/usr/bin/env groovy

def call() {
    def time = new Date().toString()
    echo "השעה הנוכחית היא: ${time}"
}