var apiclient = (function (){
    return {
        CelToFar: function (cel, callback) {
        $.get(
            {
                url: "/celsius/" + '${cel}',
                contentType: "application/json",
            }
            , function (data){
                console.log(data);
                callback(null, data);
            }
        ).fail(function (error) {
                             alert("No se pudo convertir")
                         }
                     );
        },
        FarToCel: function (fahr, callback) {
                $.get(
                    {
                        url: "/fahrenheit/" + '${fahr}',
                        contentType: "application/json",
                    }
                    , function (data){
                        console.log(data);
                        callback(null, data);
                    }
                ).fail(function (error) {
                                     alert("No se pudo convertir")
                                 }
                );
                }


    }
})();