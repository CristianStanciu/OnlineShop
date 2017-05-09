var cartApp = angular.module ("cartApp", []);
cartApp.controller("cartCtrl", function($scope, $http)  {
    $scope.refreshCart = function (cartId) {
       $http.get('/OnlineShop/rest/cart/' + $scope.cartId).success(function (data){
            $scope.cart=data;
       });
    };

    $scope.clearCart = function () {
        $http.delete('/OnlineShop/rest/cart/' + $scope.cartId).success($scope.refreshCart($scope.cartId))
    };

    $scope.initCartId = function (cartId) {
        $scope.cartId=cartId;
        $scope.refreshCart(cartId);
    };

    $scope.addToCart = function (productId) {
        $http.put('/OnlineShop/rest/cart/add/' + productId).success(function (data) {
            $scope.refreshCart($http.get('/OnlineShop/rest/cart/cartId'));
            alert("Product added to the cart");
        });
    };
    
    $scope.removeFromCart = function (productId) {
        $http.put('/OnlineShop/rest/cart/remove/' + productId).success(function (data){
           $scope.refreshCart($http.get('/OnlineShop/rest/cart/cartId'));
        });
    };
});