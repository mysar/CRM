//当前航id
var id="";

$(function(){
	alert('123');
});

// 获取当前行对象
function SelectTR(tr) {
	var tds = tr.childNodes;
	for (var j = 0; j < tds.length; j++) {
		// 获取当前航对象
		var inputs = tds[j].childNodes;
		for (var i = 0; i < inputs.length; i++) // 遍历页面上所有的 input
		{
			if (inputs[i].type == "checkbox") {
				inputs[i].checked = !inputs[i].checked;
				tr.style.backgroundColor = inputs[i].checked ? "#fafdc6" : "";
				id = inputs[i].value;
			}
		}
	}
}