window.onload=function oneTitleList(){
	$.ajax({
		type:"post",
		url:"manageTitleServlet?action=oneTitleList",
		data:{},
		dataType:"json",
		success:function(data){
			//alert(data);
			var result = eval(data);
			for(var i in result){
				//alert(data[i].onetitle_name);
				$("#oneTitleList").append("<option value='"+data[i].onetitle_id+"'>"+data[i].onetitle_name+"</option>");
			}
			var selectOneValue = $("#selectOneValue").val();
			$("#oneTitleList option[value='"+selectOneValue+"']").attr("selected","selected");
			
			
		},
		error:function(data){
			alert("fail");
		},
		
	});
	$.ajax({
		type:"post",
		url:"manageProductServlet?action=supplierList",
		data:{},
		dataType:"json",
		success:function(data){
			//alert(data);
			var result = eval(data);
			for(var i in result){
				
				$("#supplier_id").append("<option value='"+data[i].supplier_id+"'>"+data[i].supplier_name+"</option>");
			}
			var selectSupplier = $("#selectSupplier").val();
			$("#supplier_id option[value='"+selectSupplier+"']").attr("selected","selected");
		},
		error:function(data){
			alert("fail");
		},
		
	});
}

$(document).ready(function(){$("#oneTitleList").change(function(){
	
	var oneTitle_id = $(this).val();
	var selOpt = $("#twotitle_id option");  
    selOpt.remove(); 
	$.ajax({
		type:"post",
		url:"manageTitleServlet?action=twoTitleList",
		data:{oneTitle_id : oneTitle_id},
		dataType:"json",
		success:function(data){
			//alert(data);
			var result = eval(data);
			for(var i in result){
				//alert(data[i].onetitle_name);
				$("#twotitle_id").append("<option value='"+data[i].twotitle_id+"'>"+data[i].twotitle_name+"</option>");
			}
			var selectTwoValue = $("#selectTwoValue").val();
			$("#twotitle_id option[value='"+selectTwoValue+"']").attr("selected","selected");
		},
		error:function(data){
			alert("fail");
		},
		
	});
})
		});