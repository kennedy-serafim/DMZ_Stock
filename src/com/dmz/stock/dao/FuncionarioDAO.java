package com.dmz.stock.dao;

import com.dmz.stock.auxiliar.ConversorDateTime;
import com.dmz.stock.connection.ConnectionFactory;
import com.dmz.stock.model.SoftDelete;
import com.dmz.stock.model.Funcionario;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author seraf
 */
public class FuncionarioDAO {
    
    private final Connection connection = ConnectionFactory.getConnection();

    /**
     *
     * @param funcionario
     * @return
     * @throws java.text.ParseException
     */
    public int criarFuncionario(Funcionario funcionario) throws ParseException {
        String SQL = "INSERT INTO [dbo].[funcionario] ([nome], [apelido], [outro_nome], [nascimento], [genero], [b_identidade], [nuit],[nacionalidade])"
                + "     VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL,ConnectionFactory.getPreparedStatement().RETURN_GENERATED_KEYS));
            ConnectionFactory.getPreparedStatement().setString(1, funcionario.getNome());
            ConnectionFactory.getPreparedStatement().setString(2, funcionario.getApelido());
            ConnectionFactory.getPreparedStatement().setString(3, funcionario.getOutroNome());
            ConnectionFactory.getPreparedStatement().setDate(4, ConversorDateTime.utilDateToSQLDate(funcionario.getNascimento()));
            ConnectionFactory.getPreparedStatement().setString(5, funcionario.getGenero());
            ConnectionFactory.getPreparedStatement().setString(6, funcionario.getbIdentidade());
            ConnectionFactory.getPreparedStatement().setString(7, funcionario.getNuit());
            ConnectionFactory.getPreparedStatement().setString(8, funcionario.getNacionalidade());
            
            ConnectionFactory.getPreparedStatement().executeUpdate();
            
           funcionario.setId(ConnectionFactory.getLastInsertID(ConnectionFactory.getPreparedStatement()));
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            funcionario.setId(0);
        } finally {
            ConnectionFactory.closeConnection();
        }
        
        return funcionario.getId();
    }

    /**
     *
     * @param id
     * @return
     */
    public Funcionario pesquisarFuncionarioPorIDDAO(int id) {
        Funcionario funcionario = null;
        String SQL = "SELECT * FROM funcionario f "
                + " WHERE f.id_funcionario = ? AND f.soft_delete NOT IN(?);";
        
        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setInt(1, id);
            ConnectionFactory.getPreparedStatement().setString(2, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());
            
            while (ConnectionFactory.getResultSet().next()) {
                funcionario = new Funcionario();
                funcionario.setId(ConnectionFactory.getResultSet().getInt(1));
                funcionario.setNome(ConnectionFactory.getResultSet().getString(2));
                funcionario.setApelido(ConnectionFactory.getResultSet().getString(3));
                funcionario.setOutroNome(ConnectionFactory.getResultSet().getString(4));
                funcionario.setNascimento(ConnectionFactory.getResultSet().getDate(5));
                funcionario.setGenero(ConnectionFactory.getResultSet().getString(6));
                funcionario.setbIdentidade(ConnectionFactory.getResultSet().getString(7));
                funcionario.setNuit(ConnectionFactory.getResultSet().getString(8));
                funcionario.setNacionalidade(ConnectionFactory.getResultSet().getString(9));
            }
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        
        return funcionario;
    }

    /**
     *
     * @return
     */
    public List<Funcionario> retornaTodosFuncionarios() {
        Funcionario funcionario;
        List<Funcionario> funcionarios = new ArrayList<>();
        String SQL = "SELECT * FROM funcionario f "
                + " WHERE f.soft_delete NOT IN(?);";
        
        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());
            
            while (ConnectionFactory.getResultSet().next()) {
                funcionario = new Funcionario();
                funcionario.setId(ConnectionFactory.getResultSet().getInt(1));
                funcionario.setNome(ConnectionFactory.getResultSet().getString(2));
                funcionario.setApelido(ConnectionFactory.getResultSet().getString(3));
                funcionario.setOutroNome(ConnectionFactory.getResultSet().getString(4));
                funcionario.setNascimento(ConnectionFactory.getResultSet().getDate(5));
                funcionario.setGenero(ConnectionFactory.getResultSet().getString(6));
                funcionario.setbIdentidade(ConnectionFactory.getResultSet().getString(7));
                funcionario.setNuit(ConnectionFactory.getResultSet().getString(8));
                funcionario.setNacionalidade(ConnectionFactory.getResultSet().getString(9));
                
                funcionarios.add(funcionario);
            }
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        
        return funcionarios;
    }

    /**
     *
     * @param nomeFuncionario
     * @return
     */
    public List<Funcionario> retornarFuncionarioPeloNome(String nomeFuncionario) {
        Funcionario funcionario;
        List<Funcionario> funcionarios = new ArrayList<>();
        String SQL = "SELECT * FROM funcionario f "
                + " WHERE f.soft_delete NOT IN(?) AND f.nome LIKE ?;";
        
        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, nomeFuncionario + "%");
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());
            
            while (ConnectionFactory.getResultSet().next()) {
                funcionario = new Funcionario();
                funcionario.setId(ConnectionFactory.getResultSet().getInt(1));
                funcionario.setNome(ConnectionFactory.getResultSet().getString(2));
                funcionario.setApelido(ConnectionFactory.getResultSet().getString(3));
                funcionario.setOutroNome(ConnectionFactory.getResultSet().getString(4));
                funcionario.setNascimento(ConnectionFactory.getResultSet().getDate(5));
                funcionario.setGenero(ConnectionFactory.getResultSet().getString(6));
                funcionario.setbIdentidade(ConnectionFactory.getResultSet().getString(7));
                funcionario.setNuit(ConnectionFactory.getResultSet().getString(8));
                funcionario.setNacionalidade(ConnectionFactory.getResultSet().getString(9));
                
                funcionarios.add(funcionario);
            }
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        
        return funcionarios;
    }

    /**
     *
     * @param idFuncionario
     * @return
     */
    public int apagarFuncionario(int idFuncionario) {
        String SQL = "UPDATE [dbo].[funcionario]  SET soft_delete = ? , deleted_at = getdate() "
                + " WHERE id = ?";
        
        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setInt(2, idFuncionario);
            
            return ConnectionFactory.getPreparedStatement().executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return 0;
        } finally {
            ConnectionFactory.closeConnection();
        }
    }

    /**
     *
     * @param nuit
     * @return
     */
    public boolean getFuncionarioByNuitDAO(String nuit) {
        String SQL = "SELECT * FROM funcionario f "
                + " WHERE f.soft_delete NOT IN(?) AND f.nuit = ?;";
        
        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, nuit);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());
            
            return ConnectionFactory.getResultSet().next();
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection();
        }
        
    }

    /**
     *
     * @param bilheteI
     * @return
     */
    public boolean getFuncionarioByBilheteIdentidadeController(String bilheteI) {
        String SQL = "SELECT * FROM funcionario f "
                + " WHERE f.soft_delete NOT IN(?) AND f.b_identidade = ?;";
        
        try {
            ConnectionFactory.setPreparedStatement(connection.prepareStatement(SQL));
            ConnectionFactory.getPreparedStatement().setString(1, SoftDelete.DELETED.toString());
            ConnectionFactory.getPreparedStatement().setString(2, bilheteI);
            ConnectionFactory.setResultSet(ConnectionFactory.getPreparedStatement().executeQuery());
            
            return ConnectionFactory.getResultSet().next();
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } finally {
            ConnectionFactory.closeConnection();
        }
    }
    
    public static void main(String[] args) throws ParseException {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario();
        funcionario.setApelido("MASTER");
        funcionario.setGenero("Masculino");
        funcionario.setNacionalidade("Mocambicana");
        funcionario.setNascimento(ConversorDateTime.utilDateToSQLDate(new Date()));
        funcionario.setNome("JAVA");
        funcionario.setNuit("111 111 091");
        funcionario.setOutroNome("");
        funcionario.setbIdentidade("070101481953 Q");
        System.out.println(funcionarioDAO.criarFuncionario(funcionario));
        System.out.println("-------------");
        System.out.println(funcionarioDAO.retornaTodosFuncionarios());
    }
}
