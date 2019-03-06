package co.aplicared.kt.su.util

/**
 * Create new company
 * @param id Unique key for employee.
 * @param nameLong Long name for the company
 * @param nameShort Short 4 letter name for the company
 * @param employees Employees of the company
 * @param products Products of the company
 */

data class Company(
    val id: Int?,
    val nameLong: String?,
    val nameShort: String?,
    val employees: MutableList<Employee>?,
    val products: MutableList<Products>?
) {

    constructor() : this(null, null, null, null, null)


}