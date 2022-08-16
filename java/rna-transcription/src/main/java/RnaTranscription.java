class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand="";
        for(char c: dnaStrand.toCharArray()){
            switch (c){
                case 'G': {
                    rnaStrand+='C';
                    break;
                }
                case 'C':{
                    rnaStrand+='G';
                    break;
                }
                case 'T':{
                    rnaStrand+='A';
                    break;
                }
                case 'A':{
                    rnaStrand+='U';
                    break;
                }
            }
        }
        return rnaStrand;
    }

}
