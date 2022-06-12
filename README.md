# git-pre-commit-hook

### To run PMD in commandline
.\pmd.bat -d C:\Users\name\git\git-hook-test\ -f text -R rulesets/java/quickstart.xml
Download - https://pmd.github.io/

### Git configs to add - checkStyle
git config --add checkstyle.checkfile C:/Users/name/Documents/checkstyle/checkstyle-8.20-all/google_checks.xml
git config --add checkstyle.jar C:/Users/name/Documents/checkstyle/checkstyle-8.20-all.jar

Download - https://github.com/checkstyle/checkstyle/releases/
Version - 8.20 (for jdk 1.8)

