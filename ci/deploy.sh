#!/bin/bash

export env=$1
export version=$2
JAR_NAME=/home/travis/build/upputurivasavi/StringExample/target/StringExample-${version}.jar
CLASS_NAME="com.examples.Arithmaticoperations"

if [ ${env} = "dev" ] || [ ${env} = "staging" ] || [ ${env} = "prod" ]; then 
    java -cp ${JAR_NAME} ${CLASS_NAME} 3 4
    aws s3 cp ${JAR_NAME} s3://hadoop-dev-bucket/ArithmaticExamples-${version}.jar
else 
    echo "Invalid Environment"
    exit 1
fi