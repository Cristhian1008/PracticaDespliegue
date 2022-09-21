
function ConsultarProductos(){
$.ajax({
url:https://g213c7e90e2f8ec-fh7etlpc1rwx48en.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/Prueba/productos,
type:"GET",
datatype:"JSON"
success:function(Respuesta){
 console.log(Respuesta);
}
});
}