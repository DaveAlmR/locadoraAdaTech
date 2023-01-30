package br.locadora.Rest;

import br.locadora.Dao.FuncionarioDao;
import br.locadora.Domain.Funcionarios.Funcionario;
import br.locadora.Domain.Interfaces.ICliente;
import br.locadora.Services.FuncionarioService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Path;
import java.util.ArrayList;

@Path("/funcionario")
public class FuncionarioResource extends AbstractGenericCRUDRest<Funcionario, FuncionarioService> {
}
