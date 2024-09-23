pipeline {
	agent any 
		stages {
			stage('validation') {
				steps {
					echo "Checking for 'pom.xml' file for Maven project"
					bat 'mvn validate'
				}
			}
			stage('build') {
				steps {
					echo "Making build for maven project"
					bat 'mvn package'
				}
			}
			stage('execute') {
				steps {
					echo "Executing the build to get the output for maven project"
					bat 'java -jar target/MavenProject-0.0.1-SNAPSHOT.jar'
				}
			}
			stage('backup') {
				steps {
					echo "Backuping build"
					bat 'mkdir build_backups'
					bat 'cp target/MavenProject-0.0.1-SNAPSHOT.jar build_backups/'
					echo "Backup successfull"
				}
			}
		}
}
