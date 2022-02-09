var app = (function (){
     return {
                getResult: function(){
                    const unit = document.getElementById("unit");
                    const value = document.getElementById("value");
                    const result;
                    if(select.options[select.selectedIndex].value == "FaToCel"){
                        apiclient.FarToCel(author, function (error, data){
                            result = data;
                        })
                    } else{
                        apiclient.CelToFar(author, function (error, data){
                            result = data;
                        })
                    }
                }


     }
 })();