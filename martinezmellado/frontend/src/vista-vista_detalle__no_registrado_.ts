import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-comentario__no_registrado_';

@customElement('vista-vista_detalle__no_registrado_')
export class VistaVista_detalle__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: flex-start;">
   <img src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <img style="width: 20%; height: 12%;" src="../../resources/icons/user.svg">
   <label>Usuario</label>
   <vaadin-horizontal-layout style="height: 5%; width: 60%; align-items: center; justify-content: space-around;">
    <label>Fecha</label>
    <label>Ubicacion</label>
   </vaadin-horizontal-layout>
   <vista-comentario__no_registrado_ style="width: 100%; height: 40%;"></vista-comentario__no_registrado_>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
