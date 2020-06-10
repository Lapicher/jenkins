print "primer pipeline"
print "TEST"
/*
 *   Klocwork
 */



echo ${PREVIOUS_BASELINE}
echo ${PREVIOUS_TOOLS_BASELINE}
echo ${BUILD_CONFIG}
echo ${SEND_TO}
echo ${BUILD_NOTES}

/*
*    Now we set the KW projects in case they are needed
*/
String klocwork_project = 'NADA AUN MAP'
String klocwork_project_boot = ''
String klocwork_server = ''
/*
if(project_map.containsKey(params.BUILD_CONFIG))
{
    klocwork_project = project_map["${params.BUILD_CONFIG}"]['project_vuc'],
    // klocwork_project_boot = klocwork.project_map["${params.BUILD_CONFIG}"]['project_boot'],
    // klocwork_server = klocwork.project_map["${params.BUILD_CONFIG}"]['server'],
}
*/
print "MAP: "
print project_map
print "INFO: klocwork project ${klocwork_project}"
