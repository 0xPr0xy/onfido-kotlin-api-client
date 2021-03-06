/**
* Onfido API
* The Onfido API is used to submit check requests.
*
* OpenAPI spec version: 2.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


/**
 * 
 * @param applicantId 
 * @param file The file to be uploaded.
 * @param advancedValidation Validates that the live photo contains exactly one face.
 */
data class InlineObject1 (
    val applicantId: kotlin.String,
    /* The file to be uploaded. */
    val file: java.io.File,
    /* Validates that the live photo contains exactly one face. */
    val advancedValidation: kotlin.Boolean? = null
) {

}

