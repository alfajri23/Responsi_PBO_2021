/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public abstract class Model {
    abstract void show();
    abstract void delete(int id);
    abstract void update(int id);
    abstract void create(int id);
}
