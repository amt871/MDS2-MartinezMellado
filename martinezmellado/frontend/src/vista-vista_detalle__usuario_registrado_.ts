import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_detalle__usuario_registrado_')
export class VistaVista_detalle__usuario_registrado_ extends LitElement {
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
 <div id="divCabecera" style="width: 100%; height: 5%;"></div>
 <vaadin-horizontal-layout style="width: 100%; height: 95%;">
  <div id="divVideo" style="width: 60%; height: 100%; margin-left: var(--lumo-space-s);">
   <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
    <vaadin-horizontal-layout id="layoutVideo" style="width: 100%; height: 100%; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </div>
  <vaadin-vertical-layout style="height: 100%; width: 40%;">
   <vaadin-vertical-layout style="width: 100%; height: 95%; align-items: center; justify-content: center;">
    <img style="max-width: 20%; max-height: 12%;" id="imgUser">
    <label id="labelUsuario">Usuario</label>
    <vaadin-horizontal-layout style="height: 5%; width: 60%; align-items: center; justify-content: space-around;">
     <label id="labelUbi">Ubicacion</label>
     <label id="labelFecha">Fecha</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center;" id="layoutDescripcion">
     <label id="labelDescripcion">Descripcion</label>
    </vaadin-horizontal-layout>
    <div id="divComentarios" style="width: 90%; height: 50%; position: relative;">
     <vaadin-scroller id="scroller" style="width: 100%; height: 100%;"></vaadin-scroller>
    </div>
    <vaadin-horizontal-layout style="justify-content: center; align-items: center; width: 90%;" theme="spacing-s">
     <vaadin-vertical-layout style="align-items: center; justify-content: center;">
      <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton">
       <iron-icon icon="vaadin:heart" id="bMegustas"></iron-icon>
      </vaadin-button>
      <label id="labelMeGustas">Label</label>
      <vaadin-button id="bVerMeGustas">
        ver 
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%;">
      <vaadin-text-field label="Escribe tu comentario" style="width: 100%;" id="fieldComentario" maxlength="120"></vaadin-text-field>
      <vaadin-button style="align-self: flex-end;" id="bAddComentario">
        Añadir comentario 
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout style="height: 5%; width: 100%; justify-content: flex-end; padding-right: var(--lumo-space-m);">
    <vaadin-button id="bDenunciar">
     Denunciar 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
