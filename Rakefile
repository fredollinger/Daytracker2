require 'rake/clean'

PKG="./app/build/outputs/apk/debug/app-debug.apk"
NAMESPACE="com/fredollinger/day_tracker2"
DIR="app/src/main/java/com/fredollinger/day_tracker2"
DESTPATH="#{DIR}/com/fredollinger"

desc "install it"
task :install do
    sh "adb install -r #{PKG}"
end

desc "build it"
task :build do
    sh "cd #{DIR} && javac DTDate.java"
end

desc "test it"
task :test do
	sh "cd app/src/main/java && java -cp . #{NAMESPACE}/DTDate"
end

desc "clean it"
task :clean do
	sh "cd #{DIR} && rm -rvf DTDate.class test"
end
