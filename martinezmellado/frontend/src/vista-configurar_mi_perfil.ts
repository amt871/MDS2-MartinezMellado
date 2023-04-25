import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-configurar_mi_perfil')
export class VistaConfigurar_mi_perfil extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 35%; align-items: center; justify-content: center;">
   <vaadin-text-field id="idUsuario" label="Usuario"></vaadin-text-field>
   <vaadin-text-field id="idNombre" label="Nombre"></vaadin-text-field>
   <vaadin-text-field id="idFechaDeNaciemiento" label="Fecha de nacimiento"></vaadin-text-field>
   <vaadin-text-field id="idCorreoElectronico" label="Correo electronico"></vaadin-text-field>
   <vaadin-text-field id="idDescripcion" label="Descipcion"></vaadin-text-field>
   <vaadin-button id="bCambiarContrasenna">
     Cambiar contraseña 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 35%; height: 100%; align-items: center; justify-content: space-around;">
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
    <img style="width: 40%;" src="icons/user.svg">
    <vaadin-button id="bCambiarFoto">
      Cambiar 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing">
    <label>Recibir Notificaciones </label>
    <vaadin-checkbox id="idSiNoti">
      Si 
    </vaadin-checkbox>
    <vaadin-checkbox id="idNoNoti">
      No 
    </vaadin-checkbox>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <div id="divConfigurar" style="width: 30%; height: 100%;"></div>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
