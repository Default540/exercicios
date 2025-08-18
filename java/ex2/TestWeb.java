class TestWeb {
    static String tag(String tag, String body){
        tag = tag.toLowerCase();
        return "<"+tag+">"+body+"</"+tag+">";
    }
    static String tag(String tag){
        return tag(tag,"");
    }
    static String tag(String... args){

        String res = args[args.length-1];

        for (int i = args.length-2; i >= 0; i--) {
            res = tag(args[i],res);
        }
        return res;
    }
}
