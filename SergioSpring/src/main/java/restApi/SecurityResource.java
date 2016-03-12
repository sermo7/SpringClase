package restApi;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("authenticated")//Opcion alternativa a las rutas http
@RestController
@RequestMapping(Uris.SERVLET_MAP + Uris.SECURITY)
public class SecurityResource {

    @RequestMapping(value = Uris.USER, method = RequestMethod.GET)
    public String user() {
        return "OK. Acceso permitido al recurso user";
    }

    @PreAuthorize("hasRole('ROLE_MANAGER')")//Opcion alternativa a las rutas http
    @RequestMapping(value = Uris.MANAGER, method = RequestMethod.GET)
    public String manager() {
        return "OK. Acceso permitido al recurso manager";
    }
    
        @RequestMapping(value = Uris.ADMIN, method = RequestMethod.GET)
    public String admin() {
        return "OK. Acceso permitido al recurso admin";
    }
        
        @PreAuthorize("hasRole('ROLE_PLAYER')")//Opcion alternativa a las rutas http
        @RequestMapping(value = Uris.SECURITY_ANNOTATION, method = RequestMethod.GET)
        public String securityAnnotation() {
            return "OK. Acceso permitido al recurso securityAnnotation";
        }        
 
        
        @PreAuthorize("hasRole('ROLE_PLAYER')")//Opcion alternativa a las rutas http
        @RequestMapping(value = Uris.SECURITY_URI, method = RequestMethod.GET)
        public String securityURI() {
            return "OK. Acceso permitido al recurso securityAnnotation";
        }  
        


}
