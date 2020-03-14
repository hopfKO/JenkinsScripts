node {
   stage('Preparation') { // for display purposes
      echo 'Hello Preparation'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "echo 'Hello Unix'"
      } else {
         bat(/echo 'Hello notUnix'/)
      }
   }
   stage('Results') {
      echo 'Hello Results!'
   }
}
