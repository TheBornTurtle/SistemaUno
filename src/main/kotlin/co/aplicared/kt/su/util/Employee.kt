package co.aplicared.kt.su.util


/**
 * Create new employee
 * @param id Unique key for employee.
 * @param firstname Forename for employee.
 * @param surname Surname for employee.
 * @param emailPersonal Personal email for employee: OPTIONAL.
 * @param emailWork Company email for employee: OPTIONAL.
 * @param company Company of employee.
 * @param ongoing Ongoing work of employee: OPTIONAL
 * @param title Job title of employee
 */

data class Employee(
    val id: Int?,
    val firstname: String?,
    val surname: String?,
    val company: String?,
    val emailPersonal: String?,
    val emailWork: String?,
    val ongoing: MutableList<String>?,
    val title: String?
) {

    constructor() : this(null, null, null, null, null, null, null, null)

}