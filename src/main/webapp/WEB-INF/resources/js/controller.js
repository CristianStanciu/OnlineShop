var cartApp = angular.module("cartApp", []);
cartApp.controller("cartCtrl", function($scope, $http){
    $scope.refreshCart = function(){
       $http.get('/onlineshop/rest/cart/'+$scope.cartId).success(function(data){
            $scope.cart=data;
       });
    };

    $scope.clearCart = function(){
        $http.delete('/onlineshop/rest/cart/'+$scope.cartId).success($scope.refreshCart());
    };

    $scope.initCartId = function(cartId){
        $scope.cartId=cartId;
        $scope.refreshCart(cartId);
    };

    $scope.addToCart = function(productId){
        $http.put('/onlineshop/rest/cart/add/'+productId).success(function() {
            alert("Product added to the cart");
        });
    };
    
    $scope.removeFromCart = function(cartItemId){
        $http.put('/onlineshop/rest/cart/remove/'+cartItemId).success(function(data){
           $scope.refreshCart();
        });
    };

    $scope.calculateTotalPrice = function(){
        var totalPrice=0;
        for(var i=0; i<$scope.cart.cartItems.length; i++){
            totalPrice+=$scope.cart.cartItems[i].totalPrice;
        }
        return totalPrice;
    };
});