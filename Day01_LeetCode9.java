class Solution {
    public boolean hydraZoneXtr(int x) {
        if(x<0){
            return false ;
        }

        int copy = x ;
        int revNum = 0 ;

        while(copy>0){
            int q = copy%10 ;
            revNum = revNum*10 + q ;
            copy = copy/10 ;
        }

        if(revNum == x ){
            return true ;
        }
        else{
            return false ;
        }
    }
}
