import org.springframework.stereotype.Controller;


@Controller
public class PersonaController {
    @GetMapping("/")
    public String mostrarFormulario(){
        return "index";
    }

    @PostMapping("/")
    public String procesarFormulario(
        @RequestParam String nombre,
        @RequestParam String apellido,
        @RequestParam int edad,
        Model model){
            String nombreCompleto = nombre + " " + apellido;
            String tipoEdad;
            if(edad >= 18){
                tipoEdad = "Mayor de edad"
            } else {
                tipoEdad = "Menor de edad"
            }

            model.addAtribute("nombreCompleto", nombreCompleto);
            model.addAtribute("edad", edad);
            model.addAtribute("tipoEdad", tipoEdad);

            return "resultado"
        }
    )
}
