window.onload=function(){
	document.getElementById("datef").innerHTML="Today is "+ Date();
}
function validateForm() {
	document.getElementById("namelb").classList.remove("error");
    if(document.getElementById("inpname").value =="null" || document.getElementById("inpname").value == ""){
    	document.getElementById("namelb").classList.add("error");
    	return false;
    }else if(document.getElementById("inpname2").value =="null" || document.getElementById("inpname2").value == ""){
    	document.getElementById("namelb2").classList.add("error");
    	return false;
    }
    else{
        return true;
    }
}