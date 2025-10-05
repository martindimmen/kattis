#!/bin/bash

if [ $# -eq 0 ]; then
    echo "Usage: ./run.sh <problem_name.cs>"
    echo "Example: ./run.sh takkar.cs"
    exit 1
fi

FILENAME=$1

# Check if dotnet-script is installed
if ! command -v dotnet-script &> /dev/null; then
    echo "Installing dotnet-script..."
    dotnet tool install -g dotnet-script
fi

# Run with dotnet-script
dotnet script "$FILENAME"