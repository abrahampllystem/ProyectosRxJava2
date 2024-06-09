package pe.com.demo.rxjava2.Observer;

import io.reactivex.rxjava3.core.Observable;
import lombok.extern.slf4j.Slf4j;

import javax.management.RuntimeErrorException;
import java.util.Optional;

@Slf4j
public class ClassObservable {

    public static void main(String[] args) {
        Observable<String> objObsr = Observable.just("Hola","Java","text","")
                .doOnNext(element ->{
                    if (Optional.of(element).isPresent()) {
                        throw  new RuntimeException("no puede ser vacio");
                    }{
                        System.out.println(element);
                    }

                });

        objObsr.subscribe(e -> log.info(e)
        , error -> log.error(error.getMessage()));
        
    }
}
