package layout

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Employees(
    @Expose
    @SerializedName("emp_name") val emp_name: String,

    @Expose
    @SerializedName("emp_gender") val  emp_gender: String,

    @Expose
    @SerializedName("emp_email") val emp_email:String,

    @Expose
    @SerializedName("emp_salary") val emp_salary :Int){}

