package atn.test;

import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import simulation.config.ManipulationActionType;
import simulation.simjob.SimJob;

import model.ZoneNodes;

/**
 *
 * @author hunvil.rodrigues
 */
public class FormUpdateNodeConfig extends javax.swing.JDialog{
    private String existingNodeConfig;
	private ZoneNodes zoneNodes;
	private ManipulationActionType manipulationActionType;
    private String newNodeConfig;
    private HashMap<String,String> newSpeciesMap = new HashMap<String, String>();
    private Container content;
    // Change if you want, but you'll have to fix some other parts too
    private final int rows = 13, // Change this to match your number of items
            cols = 4;   // Change this at your own risk
    private final int width = cols * 200,
            height = rows * 40;
	private Frame frame;

    /**
     * Creates new form FormCustomSimulation
     */
    public FormUpdateNodeConfig(java.awt.Frame parent, boolean modal, ATNResultModel result) {
    	super(parent, result.getTitle());
    	this.frame = parent;
        existingNodeConfig = result.getNodeConfig();
        zoneNodes = result.getZoneNodes();
        manipulationActionType = result.getManipulationActionType();
        content = getContentPane();

        // Use a grid to layout buttons and add one row for control buttons
        content.setLayout(new GridLayout(rows, cols));
        setSize(width, height);         // Define dialog dimensions
        setLocationRelativeTo(null);
        initComponents();
        initFields();
    }

    private void initFields() {
    	if(existingNodeConfig != null){
    		//jTextArea2.setText(existingNodeConfig);
    	
	    	String[] temp = existingNodeConfig.split("\\[");
	    	String speciesList = new String();
	    	for(int i = 0; i< temp.length ; i++){
	    		speciesList += temp[i] + "\n";
	    	}
	    	
	    	jTextArea2.setText(existingNodeConfig + "\n\n" + speciesList);
    	}
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setText("Timesteps to run  ");

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("Run Simulations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setText("Node Index : ");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setText("Biomass : ");

        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        if(manipulationActionType.equals(ManipulationActionType.SPECIES_PROLIFERATION)){
        	jButton3.setText("ADD");
        	jLabel1.setText("Add Biomass to species - Biomass Increased");
        }
        else if(manipulationActionType.equals(ManipulationActionType.SPECIES_EXPLOIT)){
        	jButton3.setText("SUBTRACT");
        	jLabel1.setText("Remove Biomass from species - Biomass Decreased");
        }
        else if(manipulationActionType.equals(ManipulationActionType.SPECIES_INVASION)){
        	jButton3.setText("ADD NEW SPECIES");
        	jLabel1.setText("Introduce new species - Purchase New Species");
        }
        else if(manipulationActionType.equals(ManipulationActionType.SPECIES_REMOVAL)){
        	jButton3.setText("REMOVE SPECIES");
        	jLabel1.setText("Extinction of current species - Species Removal");
        }
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addContainerGap())))
        );
        
        jTextField3.setText(String.valueOf(SimJob.DFLT_TIMESTEPS));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(10);
        jTextArea1.setEnabled(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane3.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(10);
        jTextArea2.setEnabled(false);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(10);
        jTextArea3.setEnabled(false);
        jTextArea3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane2.setViewportView(jTextArea3);

        jLabel2.setText("New Biomass after simulations");

        jLabel6.setText("Current Node Configuration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       int timesteps = Integer.valueOf(jTextField3.getText());
//       ((WOBGameControl)frame).runSimulations(timesteps);
       ((WOBGameControl)frame).updateNodeConfig(newSpeciesMap, timesteps, this.manipulationActionType);     
       //If simulation is run, then disable the ADD & Run Simulation button
//     setVisible(false);
//     dispose();
    }                                        

    public void populateJTextArea3(){
 	   HashMap<Integer, Integer> result = ((WOBGameControl)frame).getPredictionResults();
       
       if(result!= null){
	       String textArea3 = "";
		   for(Entry<Integer, Integer> entry : result.entrySet()){
				textArea3 += entry.getKey() + " - " + entry.getValue() + "\n";
		   }
		   jTextArea3.setText(textArea3);
       }    
       jButton1.setEnabled(false);
       jButton3.setEnabled(false);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       System.out.println("You pressed Cancel");
       dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	if(manipulationActionType.equals(ManipulationActionType.SPECIES_PROLIFERATION)){
	    	//When you click on add we have to make sure we only support existing species
	    	populateJTextArea1();
    	}else if(manipulationActionType.equals(ManipulationActionType.SPECIES_EXPLOIT)){
	    	//When you click on subtract we have to make sure we only support existing species
	    	populateJTextArea1();
    	}else if(manipulationActionType.equals(ManipulationActionType.SPECIES_INVASION)){
	    	//When you click on subtract we have to make sure we only support existing species
	    	populateJTextArea1SpeciesInvasion();
    	}else if(manipulationActionType.equals(ManipulationActionType.SPECIES_REMOVAL)){
	    	//When you click on subtract we have to make sure we only support existing species
	    	populateJTextArea1SpeciesRemoval();
    	}
    }    
   
    public void populateJTextArea1SpeciesRemoval(){
		String textArea1 = "";
    	if(zoneNodes != null){
    		Set<Integer> speciesList = zoneNodes.getNodes().keySet();
    		String nodeIndex = jTextField4.getText().toString();
    		String biomass = jTextField5.getText().toString();
    		
    		if(speciesList.contains(Integer.valueOf(nodeIndex))){
    			//Only if the nodeIndex is not in the speciesList then add it to the newSpeciesMap
    			newSpeciesMap.put(nodeIndex, "0");
    		}
			for(Map.Entry<String, String> entry : newSpeciesMap.entrySet()){
				textArea1 += entry.getKey() + " - " + entry.getValue() + "\n";
			}

    	}
    	jTextArea1.setText(textArea1);     	
    }
    
    public void populateJTextArea1SpeciesInvasion(){
		String textArea1 = "";
    	if(zoneNodes != null){
    		Set<Integer> speciesList = zoneNodes.getNodes().keySet();
    		String nodeIndex = jTextField4.getText().toString();
    		String biomass = jTextField5.getText().toString();
    		
    		if(!speciesList.contains(Integer.valueOf(nodeIndex))){
    			//Only if the nodeIndex is not in the speciesList then add it to the newSpeciesMap
    			newSpeciesMap.put(nodeIndex, biomass);
    		}
			for(Map.Entry<String, String> entry : newSpeciesMap.entrySet()){
				textArea1 += entry.getKey() + " - " + entry.getValue() + "\n";
			}

    	}
    	jTextArea1.setText(textArea1);     	
    }
    
    public void populateJTextArea1(){
		String textArea1 = "";
    	if(zoneNodes != null){
    		Set<Integer> speciesList = zoneNodes.getNodes().keySet();
    		String nodeIndex = jTextField4.getText().toString();
    		String biomass = jTextField5.getText().toString();
    		
    		if(speciesList.contains(Integer.valueOf(nodeIndex))){
    			//Only if the nodeIndex is in the speciesList then add it to the newSpeciesMap
    			newSpeciesMap.put(nodeIndex, biomass);
    		}
			for(Map.Entry<String, String> entry : newSpeciesMap.entrySet()){
				textArea1 += entry.getKey() + " - " + entry.getValue() + "\n";
			}

    	}
    	jTextArea1.setText(textArea1);    	
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCustomSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCustomSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCustomSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCustomSimulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCustomSimulation(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}
