package br.com.core.coliseumfitapplication.config;


import br.com.core.coliseumfitapplication.dtos.ficha.ExercicioDto;
import br.com.core.coliseumfitapplication.dtos.ficha.FichaDto;
import br.com.core.coliseumfitapplication.dtos.ficha.TreinoDto;
import br.com.core.coliseumfitapplication.dtos.matricula.MatriculaDto;
import br.com.core.coliseumfitapplication.dtos.users.AdministradorDto;
import br.com.core.coliseumfitapplication.dtos.users.AlunoDto;
import br.com.core.coliseumfitapplication.dtos.users.InstrutorDto;
import br.com.core.coliseumfitapplication.model.ficha.Exercicio;
import br.com.core.coliseumfitapplication.model.ficha.Ficha;
import br.com.core.coliseumfitapplication.model.ficha.Treino;
import br.com.core.coliseumfitapplication.model.matricula.Matricula;
import br.com.core.coliseumfitapplication.model.matricula.Plano;
import br.com.core.coliseumfitapplication.model.matricula.StatusMatricula;
import br.com.core.coliseumfitapplication.model.users.Administrador;
import br.com.core.coliseumfitapplication.model.users.Aluno;
import br.com.core.coliseumfitapplication.model.users.Instrutor;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){

        ModelMapper mapper = new ModelMapper();
        //Mapping Ficha to FichaDTO
        PropertyMap<Ficha, FichaDto> FichaDTOPropertyMap = new PropertyMap<Ficha, FichaDto>() {
            protected void configure() {
                //map();
            }
        };

        PropertyMap<Treino, TreinoDto> TreinoDTOPropertyMap = new PropertyMap<Treino, TreinoDto>() {
            @Override
            protected void configure() {
                //map();
            }
        };

        PropertyMap<Aluno, AlunoDto> AlunoDTOPropertyMap = new PropertyMap<Aluno, AlunoDto>() {
            @Override
            protected void configure() {
                //map();
            }
        };

        PropertyMap<Exercicio, ExercicioDto> ExercicioDTOPropertyMap = new PropertyMap<Exercicio, ExercicioDto>() {
            @Override
            protected void configure() {
                //map();
            }
        };

        PropertyMap<Instrutor, InstrutorDto> InstrutorDTOPropertyMap = new PropertyMap<Instrutor, InstrutorDto>() {
            @Override
            protected void configure() {
                //map();
            }
        };

        PropertyMap<Administrador, AdministradorDto> AdministradorDTOPropertyMap = new PropertyMap<Administrador, AdministradorDto>() {
            @Override
            protected void configure() {
                //map();
            }
        };
        PropertyMap<Matricula, MatriculaDto> MatriculaDTOPropertyMap = new PropertyMap<Matricula, MatriculaDto>() {
            @Override
            protected void configure() {

            }
        };







        mapper.addMappings(FichaDTOPropertyMap);
        mapper.addMappings(AdministradorDTOPropertyMap);
        mapper.addMappings(InstrutorDTOPropertyMap);
        mapper.addMappings(AlunoDTOPropertyMap);
        mapper.addMappings(TreinoDTOPropertyMap);
        mapper.addMappings(ExercicioDTOPropertyMap);
        mapper.addMappings(MatriculaDTOPropertyMap);


        return mapper;
    }

}
