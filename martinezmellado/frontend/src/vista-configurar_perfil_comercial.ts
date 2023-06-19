import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';

@customElement('vista-configurar_perfil_comercial')
export class VistaConfigurar_perfil_comercial extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; height: 5%;">
  <div id="divCabecera" style="width: 100%; height: 100%;"></div>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing-xs" style="width: 100%; height: 95%; align-items: center; justify-content: center;">
  <img style="max-width: 20%; max-height: 20%;" id="imagen">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center;">
   <vaadin-button id="bCambiar">
     Cambiar 
   </vaadin-button>
   <vaadin-upload id="uploader"></vaadin-upload>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Usuario" style="padding-top: var(--lumo-space-m);" id="tfUsuario" readonly></vaadin-text-field>
  <vaadin-text-field label="Nombre" id="tfNombre"></vaadin-text-field>
  <vaadin-text-field label="Fecha de nacimiento" id="tfFechaNac"></vaadin-text-field>
  <vaadin-text-field label="Correo electronico" id="tfCorreo" readonly></vaadin-text-field>
  <vaadin-text-field label="Descripcion" id="tfDescripcion"></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; justify-content: center; align-items: center; padding-top: var(--lumo-space-xl);">
   <vaadin-button id="bCambioContra">
     Cambiar contraseña 
   </vaadin-button>
   <vaadin-button id="bGuardar">
     Guardar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
