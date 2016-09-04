#!/bin/bash

CURDIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
find "$CURDIR" -name "lecture.md" -execdir \
     pandoc '{}' -t beamer --slide-level=2 -o slides.pdf ';'
