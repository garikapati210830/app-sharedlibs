def call(ip,user,credId){
   sshagent([credId]) {
     // copy war file to tomcat
     sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat8/webapps/app.war"     
     sh "ssh ${user}@${ip} /opt/tomcat8/bin/shutdown.sh"
     sh "ssh ${user}@${ip} /opt/tomcat8/bin/startup.sh"
     // ips.each{
      //echo "Deploy on ${it}"
      // sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${it}:/opt/tomcat8/webapps/app.war"     
       //sh "ssh ${user}@${it} /opt/tomcat8/bin/shutdown.sh"
       //sh "ssh ${user}@${it} /opt/tomcat8/bin/startup.sh"  
                    
 // }
}
