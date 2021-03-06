package kata4;

import java.util.List;

class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        
        for(Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
    
}
