/*
 *   Klocwork
 */
@groovy.transform.Field
String klocwork_server_guad = 'zuas712x.zu.mx.conti.de:8092'

@groovy.transform.Field
Map project_map = [
    /* Edison */
    'otp-1.y':                          [ 'server': this.klocwork_server_guad, 'project': 'OTP_Conti_Pckgs_1y'],
    /* Bell / Watson */
    'otp-host-1.y':                     [ 'server': this.klocwork_server_guad, 'project': 'OTP_Host_Conti_Pckgs'],
    'otp-mdm9x28-2.y':                  [ 'server': this.klocwork_server_guad, 'project': 'OTP_Conti_Pckgs_2y'],
    'otp-mdm9x50-2.y':                  [ 'server': this.klocwork_server_guad, 'project': 'OTP_Conti_Pckgs_mdm9x50_2y'],
    /* Fermi */
    'otp-imx8-3.y':                     [ 'server': this.klocwork_server_guad, 'project': 'OTP_Conti_Pckgs_imx8_3y'],
    'otp-sa415m-3.y':                   [ 'server': this.klocwork_server_guad, 'project': 'OTP_Conti_Pckgs_sa415m_3y'],
    'otp-sa515m-3.y':                   [ 'server': this.klocwork_server_guad, 'project': 'OTP_Conti_Pckgs_sa515m_3y'],
    'otp-sa515m-thick-3.y':             [ 'server': this.klocwork_server_guad, 'project': 'OTP_Conti_Pckgs_sa515m_thick_3y'],
    /* OSS KB */
    'otp-oss-1.y':                      [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource'],
    'otp-oss-2.y':                      [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource'],
    'otp-oss-extap-3.y':                [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_EXTAP'],
    'otp-oss-imx8-3.y':                 [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_IMX8'],
    'otp-oss-mdm9x28-2.y':              [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_MDM9607'],
    'otp-oss-mdm9x50-2.y':              [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_MDM9650'],
    'otp-oss-modemap-3.y':              [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_MODEMAP'],
    'otp-oss-modemap-sa515m-3.y':       [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_MODEMAP_SA515M'],
    'otp-oss-modemap-sa515m-thick-3.y': [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_MODEMAP_SA515M_THICK'],
    'otp-oss-sa415m-3.y':               [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_SA415M'],
    'otp-oss-sa515m-3.y':               [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_SA515M'],
    'otp-oss-sa515m-thick-3.y':         [ 'server': this.klocwork_server_guad, 'project': 'OTP_opensource_SA515M_THICK'],
    /* TVIP */
    'bolero':                           [ 'server': this.klocwork_server_guad, 'project_vuc': 'TVIP_HTP', 'project_boot': 'TVIP_HTP_Bootloader' ],
    'microsar':                         [ 'server': this.klocwork_server_guad, 'project_vuc': 'TVIP_VUC_MICROSAR' ],
    'rh850':                            [ 'server': this.klocwork_server_guad, 'project_vuc': 'TVIP_RH850_HTP', 'project_boot': 'TVIP_RH850_HTP_Bootloader' ],
    'rh850_f1k':                        [ 'server': this.klocwork_server_guad, 'project_vuc': 'TVIP_RH850_F1K_HTP', 'project_boot': 'TVIP_RH850_F1K_HTP_Bootloader' ]
]
/*
*    Now we set the KW projects in case they are needed
*/
String klocwork_project = ''
String klocwork_project_boot = ''
String klocwork_server = ''
if(project_map.containsKey(params.BUILD_CONFIG))
{
    klocwork_project = klocwork.project_map["${params.BUILD_CONFIG}"]['project_vuc'],
    // klocwork_project_boot = klocwork.project_map["${params.BUILD_CONFIG}"]['project_boot'],
    // klocwork_server = klocwork.project_map["${params.BUILD_CONFIG}"]['server'],
}

print "INFO: klocwork project ${klocwork_project}"