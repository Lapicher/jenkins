print "primer pipeline"
print "TEST"
/*
 *   Klocwork
 */

@groovy.transform.Field
String klocwork_server_guad = 'zuas712x.zu.mx.conti.de:8092'

print "SI PASO el server"


echo "${params.PREVIOUS_BASELINE}"
echo "${params.PREVIOUS_TOOLS_BASELINE}"
echo "${params.BUILD_CONFIG}"
echo "${params.SEND_TO}"
echo "${params.BUILD_NOTES}"

/*
*    Now we set the KW projects in case they are needed
*/
String klocwork_project = 'NADA AUN MAP'
String klocwork_project_boot = ''
String klocwork_server = ''

print "MAP: "
print "INFO: klocwork project ${klocwork_project}"
