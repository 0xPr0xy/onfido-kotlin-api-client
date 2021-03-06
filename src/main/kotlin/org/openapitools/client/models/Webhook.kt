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
 * @param id The unique identifier of the webhook. Read-only.
 * @param token Webhook secret token used to sign the webhook's payload. Read-only.
 * @param href The API endpoint to retrieve the webhook. Read-only.
 * @param url The url that will listen to notifications (must be https).
 * @param enabled Determine if the webhook is active.
 * @param environments The environments from which the webhook will receive events. Allowed values are “sandbox” and “live”. If the environments parameter is omitted the webhook will receive events from both environments. 
 * @param events The events that will be published to the webhook. The supported events are: `report.completed`, `report.withdrawn`, `check.completed`, `check.started`, `check.form_opened`, `check.form_completed`. If the events parameter is omitted all the events will be subscribed. 
 */
data class Webhook (
    /* The url that will listen to notifications (must be https). */
    val url: kotlin.String,
    /* The unique identifier of the webhook. Read-only. */
    val id: kotlin.String? = null,
    /* Webhook secret token used to sign the webhook's payload. Read-only. */
    val token: kotlin.String? = null,
    /* The API endpoint to retrieve the webhook. Read-only. */
    val href: kotlin.String? = null,
    /* Determine if the webhook is active. */
    val enabled: kotlin.Boolean? = null,
    /* The environments from which the webhook will receive events. Allowed values are “sandbox” and “live”. If the environments parameter is omitted the webhook will receive events from both environments.  */
    val environments: kotlin.Array<kotlin.String>? = null,
    /* The events that will be published to the webhook. The supported events are: `report.completed`, `report.withdrawn`, `check.completed`, `check.started`, `check.form_opened`, `check.form_completed`. If the events parameter is omitted all the events will be subscribed.  */
    val events: kotlin.Array<kotlin.String>? = null
) {

}

